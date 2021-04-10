<?php
/* *****************************************************
*       Uploads model
   ***************************************************** */

// Add image information to the database table 
function storeImages($imgPath, $invId, $imgName, $imgPrimary)
{
    $db = phpmotorsConnect();
    $sql = 'INSERT INTO images (invId, imgPath, imgName, imgPrimary) VALUES (:invId, :imgPath, :imgName, :imgPrimary)';
    $stmt = $db->prepare($sql);
    // Store the full size image information
    $stmt->bindValue(':invId', $invId, PDO::PARAM_INT);
    $stmt->bindValue(':imgPath', $imgPath, PDO::PARAM_STR);
    $stmt->bindValue(':imgName', $imgName, PDO::PARAM_STR);
    $stmt->bindValue(':imgPrimary', $imgPrimary, PDO::PARAM_INT);
    $stmt->execute();

    // Make and store the thumbnail image information
    // Change name in path
    $imgPath = makeThumbnailName($imgPath);
    // Change name in file name
    $imgName = makeThumbnailName($imgName);
    $stmt->bindValue(':invId', $invId, PDO::PARAM_INT);
    $stmt->bindValue(':imgPath', $imgPath, PDO::PARAM_STR);
    $stmt->bindValue(':imgName', $imgName, PDO::PARAM_STR);
    $stmt->bindValue(':imgPrimary', $imgPrimary, PDO::PARAM_INT);
    $stmt->execute();

    $rowsChanged = $stmt->rowCount();
    $stmt->closeCursor();
    return $rowsChanged;
}

// Function to get Images from image table
function getImages()
{
    $db = phpmotorsConnect();
    // The SQL statement to be used with the database 
    $sql = 'SELECT 
                imgId, imgPath, imgName, imgDate, 
                inventory.invId, invMake, invModel
            FROM
                images
            JOIN
                inventory
            ON 
                images.invId = inventory.invId';
    // The next line creates the prepared statement using the phpmotors connection      
    $stmt = $db->prepare($sql);
    // The next line runs the prepared statement 
    $stmt->execute();
    //Ask how many rows has changed 
    $imageArray = $stmt->fetchAll(PDO::FETCH_ASSOC);
    $stmt->closeCursor();
    return $imageArray;
}

// Function to delete images from the images table
function deleteImage($imgId)
{
    $db = phpmotorsConnect();
    // The SQL statement to be used with the database 
    $sql = 'DELETE FROM 
                images
            WHERE 
                imgId = imgId';
    // The next line creates the prepared statement using the phpmotors connection      
    $stmt = $db->prepare($sql);
    $stmt->bindValue(':imgId', $imgId, PDO::PARAM_INT);
    // The next line runs the prepared statement 
    $stmt->execute();
    $result = $stmt->rowCount();
    $stmt->closeCursor();
    return $result;
}

// Function to check an existing image 
function checkExistingImage($imgName){
    $db = phpmotorsConnect();
    $sql = "SELECT imgName FROM images WHERE imgName = :name";
    $stmt = $db->prepare($sql);
    $stmt->bindValue(':name', $imgName, PDO::PARAM_STR);
    $stmt->execute();
    $imageMatch = $stmt->fetch();
    $stmt->closeCursor();
    return $imageMatch;
   }

function getVehicleThumbnailsPath($vehicleId) {
    $db = phpmotorsConnect();
    $sql = 'SELECT 
	            imgPath 
            FROM 
                inventory 
            INNER JOIN	
	            images
            ON 
	            inventory.invId = images.invId
            WHERE 
                inventory.invId 
            IN 
                (SELECT inventory.invId FROM inventory WHERE inventory.invId = :invId)
            AND
	            imgPrimary = 0
            AND 
                imgName 
            LIKE
	            "%-tn.%"';
    $stmt = $db->prepare($sql);
    $stmt->bindValue(':invId', $vehicleId, PDO::PARAM_STR);
    $stmt->execute();
    $thumbnails = $stmt->fetchAll(PDO::FETCH_ASSOC);
    $stmt->closeCursor();
    return $thumbnails;
}
