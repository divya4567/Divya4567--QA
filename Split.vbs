option explicit
'declare a variable
Const SITE_TITLE="www,using split function,com"

'declare a array named with 10 elements
Dim arrayTitle1
arrayTitle1= Split(SITE_TITLE,",")   'split function will split the string with given separator
MsgBox arrayTitle1(0)
MsgBox arrayTitle1(1)
MsgBox arrayTitle1(2)

Dim arrwebsite(2)
arrwebsite(0)="www"
arrwebsite(1)="using join function"
arrwebsite(2)="com"
Dim siteurl
siteurl=join(arrwebsite,".")
MsgBox siteurl