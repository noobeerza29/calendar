
<?php
include "Date.php";
    $month = $_POST["month"];
    $day = $_POST["day"];

   $calendar =new Date();
   $result = $calendar->showday($month,$day);
   echo $result;
?>