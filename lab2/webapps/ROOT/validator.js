



function Validate(){
    var firstName = document.getElementById("firstName");
    var lastName = document.getElementById("lastName");
    var resultStatus = true;
    var messageStr = "The following errors were detected: ";
    if (firstName == null || firstName.value == "")
    {
    resultStatus = false;
    messageStr += "Firstname is empty or blank \n";
    }
    if (lastName == null || lastName.value == "")
    {
    resultStatus = false;
    messageStr += "Last name is empty or blank \n";
    }
    if (!resultStatus)
    alert(messageStr);
    return resultStatus;

}