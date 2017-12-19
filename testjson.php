<?php

 $connection = mysql_connect("localhost", "root", "");
mysql_select_db("george");
$jsondata=file_get_contents('testjson1.json');

$data=json_decode($jsondata,true);

$name=$data['name'];
$age=$data['age'];
$city=$data['city'];
  $sql="INSERT INTO student(name,age,city)VALUES('$name','$age','$city')";
$s=mysql_query($sql);

if($s)
{
	echo "Record insert successfully";
}
else
{
	echo "problem occur";
}

?>