/**********************************************************************************************************************************************************************/
                                                                        /*flavours.html*/
/**********************************************************************************************************************************************************************/

<!-- DO NOT ALTER ANYTHING THIS FILE.  WRITE YOUR CODE IN THE 'script.js'-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>jQuery Select Element by Compound Selector</title>
</head>
<body>
    <p id="icecream"><strong>ICE CREAM TYPES</strong></p>
    <p>Choose Your Flavours</p>
    <ul class="flavours">
        <li>Moon Mist</li>
        <li>Moose Tracks</li>
        <li>Raspberry Ripple</li>
    </ul>
    <ul id="icecreamfloats">
        <li>Purple Cow</li>
        <li>Snow White</li>
        <li>Sherbet Cooler</li>
    </ul>
   <ul class="flavours">
        <li>Oyster Ice Cream</li>
        <li>Hokey Pokey </li>
        <li>Blue Moon</li>
    </ul>
 
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="script.js"></script>
</body>
</html>










/**********************************************************************************************************************************************************************/
                                                                        /*script.js*/
/**********************************************************************************************************************************************************************/
// WRITE YOUR CODE HERE

$("p").css("color", "orange");
$(".flavours li").css({
    "background-color" : "lightblue",
    "font-size" : "120%"
});
    
$("p:last").css("font-size", "50%");

$("#icecreamfloats li").css("background-color", "orange");


