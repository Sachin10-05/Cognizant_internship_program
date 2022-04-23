/***********************************************************************************************************************************************************************/
                                                                /*script.js*/
/***********************************************************************************************************************************************************************/

function modifyString(str){
    str=str.replace(/\s/g,"");
    //str = str.split(' ');
    //str = str.join('');
    str=str.toLowerCase();
    return str;
}

function uniqueCharacters(str){
    var str1 = modifyString(str);
    var res ="";
    
    for(var i = 0; i < str1.length; i++){
    if(res.includes(str1[i]) === false){
      res += str1[i];
    }
  }
  return res;
}
 
     
