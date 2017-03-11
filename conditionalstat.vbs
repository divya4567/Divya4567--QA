'===========================
'conditional if
'===========================

option explicit
Dim x
x=5
if x>5 Then
MsgBox " massage A: the given numbe is grater than 5"

elseif x=5 Then
MsgBox "message B : the given number is equal to 5"

elseif x<5 Then
MsgBox " message C : the given number is lessthan 5"
End if

Dim name1,name2
name1= "john"
name2= "peter"

'using <>(not equal)
if name1<>name2 Then
   MsgBox "names didnot match"
End If   