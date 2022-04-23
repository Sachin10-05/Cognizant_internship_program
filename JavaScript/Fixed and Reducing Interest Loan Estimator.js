/***********************************************************************************************************************************************************************/
                                                            /* ReducedInterestEstimator.html*/
/***********************************************************************************************************************************************************************/
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Reducing Interest Loan Estimation</title>
    <style type="text/css">
        h2 {
            text-align: center;
            color: #FF0000;
            font-style: italic;
            font-weight: bold;
        }

        table {
            text-align: left;
            background-color: #FFE77A;
            padding: 10px;
        }

        thead {
            text-align: center;
        }

        #tablemain {
            margin-left: 35%;
        }

        #Estimate {
            background-color: #F1F334;
            color: #000000;
            font-size: 15px;
            height: 35px;
            width: 100px;
        }
    </style>
</head>
<body>
<h2>Reducing Interest Loan Estimation</h2>
<table id="tablemain">
    <tbody>
    <tr>
        <td>
            <table>
                <tbody>
                <tr>
                    <td>
                        <label for="principalAmount">Principal Loan Amount (Rs.)</label>
                    </td>
                    <td>
                        <input type="text" id="principalAmount" placeholder="Principal Amount" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="interestRate">Interest Rate (%)</label>
                    </td>
                    <td>
                        <input type="text" id="interestRate" placeholder="Interest Per Annum" required>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="tenure">Tenure (in months)</label>
                    </td>
                    <td>
                        <input type="text" id="tenure" placeholder="Tenure in Months" required>
                    </td>
                </tr>

                <tr>
                    <td></td>
                    <td align="left" style="padding: 10px">
                        <input id="Estimate" type="button" value="Estimate" onclick="EstimateReducingInterestLoan()">
                    </td>
                </tr>
                </tbody>
            </table>
        </td>
    </tr>
    <tr>
        <td>
            <table border="1">
                <caption><b>Loan Estimation</b></caption>
                <thead>
                <tr>
                    <th>Details</th>
                    <th>Reducing Interest Loan</th>
                    <th>Fixed Interest Loan</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Total Interest Rs.</td>
                    <td>
                        <output id="tInterest"></output>
                    </td>
                    <td>
                        <output id="tInterestFixed"></output>
                    </td>
                </tr>
                <tr>
                    <td>Total Payment Rs.</td>
                    <td>
                        <output id="tPayment"></output>
                    </td>
                    <td>
                        <output id="tPaymentFixed"></output>
                    </td>
                </tr>
                <tr>
                    <td>Monthly EMI Rs.</td>
                    <td>
                        <output id="EMI"></output>
                    </td>
                    <td>
                        <output id="EMIFixed"></output>
                    </td>
                </tr>
                </tbody>
            </table>
        </td>
    </tr>
    </tbody>
</table>
<script src="Estimation.js"></script>
</body>
</html>




/********************************************************************************************************************************************************************/
                                                          /* Estimation.js*/
/********************************************************************************************************************************************************************/

var P = document.getElementById("principalAmount").value;   // Principal amount
var r = document.getElementById("interestRate").value;
var N = document.getElementById("tenure").value;            // Tenure in months

var R = r/1200;                                             // Rate of interest

function EstimateReducingInterestLoan(){
    calculateEMI();
    totalPayment();
    totalInterest();
    EstimateFixedInterestLoan();
}

function EstimateFixedInterestLoan(){
    var P = document.getElementById("principalAmount").value;
    var r = document.getElementById("interestRate").value;
    var N = document.getElementById("tenure").value;
    var R = r/100;

    var tiFixed =  (P*R*N)/12;
    var tpFixed =  parseFloat(P) + parseFloat(tiFixed);
    var emiFixed = tpFixed / N;
    
    document.getElementById("EMIFixed").innerHTML = Number(emiFixed).toFixed(2);
    document.getElementById("tPaymentFixed").innerHTML = Number(tpFixed).toFixed(2);
    document.getElementById("tInterestFixed").innerHTML = Number(tiFixed).toFixed(2);
}


function calculateEMI(){
    var P = document.getElementById("principalAmount").value;
    var r = document.getElementById("interestRate").value;
    var N = document.getElementById("tenure").value;
    var R = r/1200;

    var emi = (P * R * (Math.pow((1 + R), N) / (Math.pow((1 + R), N) - 1)));
    document.getElementById("EMI").innerHTML = Number(emi).toFixed(2);
    return emi;
}

function totalPayment(){
    var N = document.getElementById("tenure").value;         
    var tp =  (calculateEMI() * N);
    document.getElementById("tPayment").innerHTML = Number(tp).toFixed(2);
    return tp;
}

function totalInterest(){
    var P = document.getElementById("principalAmount").value;
    var ti = (totalPayment() - P);
    document.getElementById("tInterest").innerHTML = Number(ti).toFixed(2).toString();
    return ti;
}



