/***********************************************************************************************************************************************************************/
                                                                    /*chkbox.html*/
/***********************************************************************************************************************************************************************/
<!-- DO NOT ALTER THIS FILE -->

<!doctype html>
<html lang="en">

<body>
    <form id="form">
        <input type="checkbox" id="red" name="red" value="Red"/>Red
        <input type="checkbox" id="green" name="green" value="Green"/>Green
        <input type="checkbox" id="blue" name="blue" value=" Blue"/>Blue
        <input type="checkbox" id="black" name="black" value="Black"/>Black<br/>
        <div id="result">0 boxes are checked</div>
    </form>

    <div id="result"></div>

    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="chkbox.js"></script>
</body>
</html>




/***********************************************************************************************************************************************************************/
                                                                    /*chkbox.js*/
/***********************************************************************************************************************************************************************/
//WRITE YOUR jQUERY CODE HERE

var i=0;
$('input:checkbox').click(function(){
    
    var x = $('#form input[type="checkbox"]');
    x.change(function(){
        var i = x.filter(':checked').length;
        
        if(i===0){
            $("#result").text(i + " boxes are checked");
        }
        else if(i===1){
            $("#result").text(i + " box is checked");
        }
        else{
            $("#result").text(i + " boxes are checked");
        }
    });
    
});

