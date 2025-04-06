dim x as integer=710
dim y as integer=1170
'eu a4
dim colors as integer=14
dim colors2 as integer=0
dim grid as integer=30
dim mx as integer=x/4
dim my as integer=y/4
dim xx as integer=mx*grid
dim yy as integer=my*grid
dim xxx as integer=mx*grid
dim xxxx as integer=mx*grid

dim n as integer=0
dim nn as integer=0
color 0,6
cls
screen 12
color 0,colors
cls 
print "creat..."
dim graphic as any ptr= imagecreate(x, y, colors,4)
line graphic,(0,0)-(x,y),colors,bf
line graphic,(0,0)-(x-1,y-1),colors2,b
for n=0 to 7
    yy=y
    xx=x/2
    xxx=xx/2
    xxxx=xxx/7
    line graphic,(xxx+n*xxxx+50,60)-(xxx+n*xxxx+(xxxx/2)+50,y-60),0,bf
next
line graphic,(0,y/2-80)-(x-1,y/2),colors2,b
line graphic,(0,y/2)-(x-1,y/2),colors2,b
bsave "my.bmp",graphic
ImageDestroy graphic