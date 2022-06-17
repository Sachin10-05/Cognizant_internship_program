<!-- This is a partial code. Implement the essential codes required --> 
<!-- Do not modify the name or id of the components given in the code skeleton -->

<!DOCTYPE html>
<html>
    <head>
        <style>
            h1{
                font-style:italic;
                font-weight:bold;
                text-align:center;
                color:#b03060;
            }
            table{
                float:left;
                width:35%;
                border:5px solid;
                border-width:30%;
                padding:10px;
            }
            tr,td{
                padding: 35px;
                border-style: solid 5px;
                border-width: 30%;
            }
            #submit{
                float:left;
                width:45%;
                margin-left:45%;
            }
            div{
                text-align:center;
                font-weight:bold;
            }
            #result{
                font-style:italic;
                color:#FF0000;
                font-size:40px;
            }
            #discount{
                font-size:25px;
            }
        </style>
    </head>
    <body style="background-color:#99FFFF;">
        <h1>DISCOUNT PRICE</h1>
        <form onsubmit="return calculate()" action="/">
            <table>
                <tr>
                    <td>Product Name</td>
                    <td><input type="text" name="name" pattern="[a-zA-Z]+" required="" ></td>
                </tr>
                <tr>
                    <td>Product Price</td>
                    <td><input type="number" id="price" name="price" min="15001" required></td>
                </tr>
                <tr>
                    <td>Season</td>
                    <td><select name="season" id="season">
                        <option value="summer">SUMMER SALE</option>
                        <option value="newyear">NEW YEAR SALE</option>
                        <option value="clearance">CLEARANCE SALE</option>
                    </select></td>
                </tr>
            </table>
            </form>
            <br />
            <br />
            <input type="submit" value="GET DISCOUNT PRICE" id="submit" onclick="calculate()" id="submit">
        <!--</form>-->
        <div id="discount"></div>
        <div id="result"></div>
        <script>
            function calculate()
            {
                //fill code here
                var p=document.getElementById("price").value;
                var s=document.getElementById("season").value;
                var d;
                if (s=="summer"){
                    document.getElementById("discount").innerHTML="The discount is 10%";
                    d=(p-(p*0.1));
                }
                else if (s=="newyear"){
                    document.getElementById("discount").innerHTML="The discount is 5%";
                    d=(p-(p*0.05));
                }
                else if (s=="clearance"){
                    document.getElementById("discount").innerHTML="The discount is 15%";
                    d=(p-(p*0.15));
                }
                
                document.getElementById("result").innerHTML="The discounted price : Rs" +d;
                // return false;
                
            }   
        </script>
    </body>
</html>
