/***********************************************************************************************************************************************************************/
                                                                      /*Customer.html*/
/***********************************************************************************************************************************************************************/
<!-- DO NOT CHANGE THIS FILE -->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>jQuery Add / Remove Table Rows Dynamically</title>
    <style type="text/css">
        form
        {
            margin: 20px 0;
        }
        form input, button
        {
            padding: 5px;
        }
        table
        {
            width: 40%;
            margin-bottom: 20px;
	    border-collapse: collapse;
        }
        table, th, td
        {
            border: 1px solid #cdcdcd;
        }
        table th, table td
        {
            padding: 10px;
            text-align: left;
        }
    </style>
</head>
<body>

    <form id="frm">
        Name: <input type="text" id="name" placeholder="Name">
       	<input type="button" class="add-row" value="Add Customer Details">
   
    <table>
        <thead>
            <tr>
                <th>Select</th>
                <th>Name</th>
                
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><input type="checkbox" name="record"></td>
                <td>Esther Saradha</td>
               </tr>
        </tbody>
    </table>
    <button type="button" class="delete-row">Delete Customer Details</button>
    </form>

    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="customer.js"></script>
</body> 
</html>  











/***********************************************************************************************************************************************************************/
                                                                      /*Customer.js*/
/***********************************************************************************************************************************************************************/

//WRITE YOUR jQUERY CODE HERE
$(".add-row").click(function(){
 var name = $("#name").val();
 var markup = "<tr><td><input type='checkbox'name='record'></td><td>" + name +
"</td></tr>";
 $("table tbody").append(markup);
 });
$(".delete-row").click(function(){
 $("table tbody").find('input[name="record"]').each(function(){
 if($(this).is(":checked")){
 $(this).parents("tr").remove();
}
});
});



