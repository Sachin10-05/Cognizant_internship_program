/********************************************************************************************************************************************************************/
                                                                     /*login.html*/
/*******************************************************************************************************************************************************************/

<!-- DO NOT CHANGE THE GIVEN TEMPLATE.  ONLY ADD NECESSARY CLASSES TO THE REQUIRED BUTTONS.    -->

<!DOCTYPE HTML>

<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
    .input1
    {
        padding: 10px;
    }
    .gh
    {
        padding:20px;padding-left:350px;padding-right:350px;
    }
    </style>
</head>
<body class="container gh" id="body" >
    <div class="panel" style="background-color:#d8d8d8;padding-bottom:20px;" id="home">
    <center>
    <form id="login_form" action="success.htm" >
        <input type="button" value="Login" id="login" class="btn btn-info">
        <input type="button" value="Signup" id="signup" class="btn btn-info">
    </form>
    <div id="login_div">
    <form>
        <div class="input1">
            <input type="text" id="email" placeholder="Email" class="form-control" required="required"/></div>
        <div class="input1">
        <input type="password" id="password" pattern={a-zA-Z0-9}{6,} class="form-control" placeholder="Password" required="required"/>
        </div>
        <input type="submit" value="Submit" id="submit" class="btn btn-primary"/>
    </form>
    </div>
</center>
</div>



<div id="signup_div" class="panel" style="background-color:#d8d8d8;padding-bottom:90px;">

<form>
    <table align="center" style="padding-top:100px;">
        <tr><td colspan="4"><b>Name*</b></td></tr>
        <tr><td colspan="4"><input type="text" id="name" class="form-control" required="required"/></td></tr>
        <tr><td><b>Gender*</b><br><select id="gender" class="form-control">
        <option value="none">None</option>
        <option value="male">Male</option>
        <option value="female">Female</option>
        </select></td>
        <td></td>
        <td><b>Age*</b><br><input type="number" id="age"  class="form-control" required="required" size="1px"></td>
        </tr>
    
  
        <tr><td><b>Password*</b></td></tr>
        <tr><td><input type="password" id="pass" placeholder="Minimum 6 Character"  class="form-control" required="required"/></td></tr>
        <tr><td><b>Confirm-Password*</b></td></tr>
        <tr><td><input type="password" id="conpass"  class="form-control" required="required"/></td></tr>
        <tr><td></tr>
        <tr>   
  
        <td align="center"  style="padding-left:100px;padding-top:20px;" ><input  type="submit" value="submit" class="btn btn-primary" />
        <input  type="reset" value="Reset" class="btn btn-primary" /></td></tr>
    </table>
</form>

    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="login.js"> </script>
</div>  
</body>
</html>



/********************************************************************************************************************************************************************/
                                                                     /*login.js
/********************************************************************************************************************************************************************/

//WRITE YOUR JQUERY CODE HERE

$("#signup_div").hide();
$("#signup").click(function(){
    $("#signup_div").show();
})



















