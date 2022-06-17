<!-- This is a partial code. Implement the essential codes required --> 
<!-- Do not use replaceAll() in your solution. Instead, use replace() -->
<!-- Do not modify the name or id of the components given in the code skeleton -->

<html>
    <body>
        <form onsubmit="return display()">
        Enter word/sentence to check for palindrome:<input type="text" name="palin"><br>
        <input type="submit" name="palinbtn" value="Check Palindrome">
        </form>
        <script>
         function display()
         {
             //fill code here
             var str=document.getElementById("palin").value;
             var str=str.replace(/\s/g,"").toLowerCase();
             var input=str.split("");
             var output=input.reverse().join("");
             if(str==output) alert('The entry is a palindrome.');
             else alert('The entry is not a palindrome.');
             return false;
         }
        </script>
    </body>
</html>
