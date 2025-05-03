
import time
import random
print ("\033c\033[43;30m\nenter simulator\n")
def floats():
    f=float(random.randrange(1,9)-5)
    return f
def collapseEvent():
    rets=random.randrange(1,1000)
    retss=rets>995
    return retss
def sims(n):
    totals=0
    money=float(0.0)
    rets=[]
    nn=0
    t=True
    castle=float(0.0)
    houses=float(0.0)
    while t:
        print(str(totals)+" units")
        totals=totals+n
        if collapseEvent():
           print("collapse event all house as destroy")
           totals=0
        if totals>10:
            totals=0
            houses=float(9.00+floats())
            castle=float(9.00+floats())
            
            print("castle=2 X "+str(float(castle))+" ="+str(float(castle*2.00)))
            print("houses=8 X "+str(float(houses))+" ="+str(float(houses*8.00)))
            money=money+float(castle*8.00)+float(houses*8.00)-float(110.00)
            print("expenses="+str(float(110.00)))
            print("money="+str(float(money)))
            print("8 units as houses")
            print("2 units castle")
        time.sleep(1)
    
sims(1)