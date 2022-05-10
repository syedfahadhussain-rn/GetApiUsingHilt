package com.example.getapiusinghilt

import com.google.gson.annotations.SerializedName

data class DataSub(
    @SerializedName("Account Number")
    val Account_Number: String?,
    @SerializedName("Bank Branch")
    val Bank_Branch: String?,
    @SerializedName("Bank Ifsc Code")
    val Bank_Ifsc_Code: String?,
    @SerializedName("Bank Name")
    val Bank_Name: String?,
    @SerializedName("Branch Address") val Branch_Address: String?,
    @SerializedName("Branch Name") val Branch_Name: String?,
    @SerializedName("Confirmation Date") val Confirmation_Date: String?,
    @SerializedName("Date of Joining") val Date_of_Joining: String?,
    @SerializedName("Department") val Department: String?,
    @SerializedName("Employee Status") val Employee_Status: String?,
    @SerializedName("Employer ID") val Employer_ID: String?,
    @SerializedName("First Name") val First_Name: String?,
    @SerializedName("Gender") val Gender: String?,
    @SerializedName("Last Name") val Last_Name: String?,
    @SerializedName("Middle Name") val Middle_Name: String?,
    @SerializedName("Office Email") val Office_Email: String?,
    @SerializedName("Probation Period") val Probation_Period: String?,
    @SerializedName("Reporting Manager") val Reporting_Manager: String?,
    @SerializedName("Skype Id") val Skype_Id: String?,
    @SerializedName("shift") val shift: String?
)
