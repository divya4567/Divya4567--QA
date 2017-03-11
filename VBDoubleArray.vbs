option explicit
dim doublearray(1,4)
Const SITE_TITLE= "DOUBLE DIMENSTION ARRAY"
doublearray(0,0)="apple"
doublearray(0,1)="papaya"
doublearray(0,2)="grape"
doublearray(0,3)="pineapple"
doublearray(0,4)="pear"

doublearray(1,0)="john"
doublearray(1,1)="kristy"
doublearray(1,2)="ruffle"
doublearray(1,3)="jodi"
doublearray(1,4)="jaime"

MsgBox doublearray(1,0) & "likes " & doublearray(0,0) & " !!!",0,SITE_TITLE
MsgBox doublearray(1,1) & "likes " & doublearray(0,1) & " !!!",0,SITE_TITLE
MsgBox doublearray(1,2) & "likes " & doublearray(0,2) & " !!!",0,SITE_TITLE
MsgBox doublearray(1,3) & "likes " & doublearray(0,3) & " !!!",0,SITE_TITLE
MsgBox doublearray(1,4) & "likes " & doublearray(0,4) & " !!!",0,SITE_TITLE