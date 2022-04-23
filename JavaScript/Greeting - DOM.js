/***********************************************************************************************************************************************************************/
                                                                     /*index.html*/
/************************************************************************************************************************************************************************/

<html>
    <head>
        <script src="script.js"></script>
    </head>
    <body>
        <h2>Elite Coaching Center</h2>
        
        <table border=1>
            <tr>
                <td>Student Name</td>
                <td><input id="sname" type="text" required></td>
            </tr>
            <tr>
                <td>Course</td>
                <td>
                    <select id="course"  name="abcd" required>
                        <option value="Python">Python</option>
                        <option value="Java">Java</option>
                        <option value="Oracle">Oracle</option>
                    </select>
                </td>
            </tr>
        </table>
        <br />
        <input type="button" id="submit" value="Register" onclick="display()">
        <br />
        
        <div id="greet"></div>
        
    </body>
</html>






/********************************************************************************************************************************************************************/
                                                                    /* script.js*/
/********************************************************************************************************************************************************************/

function display(){
    
    var x = document.getElementById("sname").value;
    var c = document.getElementById("course").value;
    
    if (x.length === 0) {
        document.getElementById("greet").innerHTML = "Name cannot be empty";
    }
    else {
        document.getElementById("greet").innerHTML = "Hi, " + x + "." + " You have successfully registered for the " + c + " course.";
    }
}





          
