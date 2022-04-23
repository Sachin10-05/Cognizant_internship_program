/***********************************************************************************************************************************************************************/
                                                            /*script.js*/
/***********************************************************************************************************************************************************************/

function OrderCake(str) 
{
    var n = str.length;
    var x = str.slice(0,4);
	var y = (x)/1000;
	
	var weight = Math.round(y);                       //weight
	var z = str[n-3] + str[n-2] + str[n-1];           // Order no
	
	var cost = Math.round(450 * (y));
	var t = str.slice(4,(n-3));                       //cake name
	
	var res = "Your order for " + weight + " kg " + t +  " cake has been taken. You are requested to pay Rs. " + cost.toString() + " on the order no " + z;
	return res;
}
