package export
def employee=[
	'name':'Azo','age':50, 'poslodavac':'SD'
	]
	
	//println employee.name
//	println employee['name']
	//println employee.get('age')
//	println employee.getAt('age')
	//println employee.size()
//	
	//employee.put('city','paris')
	//println employee
	//println employee.containsKey('name')
	//println employee.containsValue(50)
	
	println employee.getClass()
	
	def emp2 = employee.clone();
	println emp2
	
	employee.each{ key,value ->
		println "$key:$value"
	}
	employee.eachWithIndex{ key,value, i ->
		println "$i |$key:$value"
	}
	employee.eachWithIndex { entry -> 
		println "$entry.key : $entry.value"
	}
	
	def map1 =['a':1,'b':2]
	def entries = map1.entrySet()
	entries.each { entry ->
		assert entry.key in['a','b']
		assert entry.value in[1,2]
	}
	employee.clear()
	println employee
	
