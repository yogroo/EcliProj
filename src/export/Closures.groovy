package export
def str = "hello"
def myClosure1 = {name -> println "${str} ${name}"}
myClosure1.call("Azo")

def MyMethod(clos){
	clos.call("Groovy")
	}
MyMethod(myClosure1)

def MyClosure2 = {
	a,b,c -> return(a+b+c)
}

def res = MyClosure2(10,20,30)
println res

def myList1 =["Apples", "Oranges", "Grapes"]
println myList1.each { it }

def MyMap = ['subject':'groovy','topic':'closures']

println MyMap.each{it}
def MyList =[1,2,3,4,5]
println MyList.find {cr -> cr==5}
println MyList.findAll { racku -> racku >3 }
println MyList.any { ckapi -> ckapi > 5 }
println MyList.every { pred -> pred > 3}

println MyList.collect{svakipomnozisadva -> svakipomnozisadva *2}
