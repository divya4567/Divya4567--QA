option explicit
Const SITE_TITLE= "DYNAMIC ARRAY!!!"
Dim Dynamicarray()
ReDim Dynamicarray(4)
'REDIM is help to resize (dynamic size) the array later
Dynamicarray(0)="john"
Dynamicarray(1)="jodi"
Dynamicarray(2)="peter"
Dynamicarray(3)="mike"
Dynamicarray(4)="kenny"
ReDim  Preserve Dynamicarray(9)
'Preserve would help to save the previous values which are assigned before resizing the array

Dynamicarray(8)="Tommy"
MsgBox Dynamicarray(4),0, SITE_TITLE
MsgBox Dynamicarray(8),0, SITE_TITLE

'also tere is different method to assign values to array
'Dim Dynamicarray 
D'ynamicarray= ARRAY("john","peter","jimmy","kevin","tom")
'MsgBox Dynamicarray(0)