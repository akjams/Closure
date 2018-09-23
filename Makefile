runAll:
	go run goclosure.go
	python3 pythonclosure.py
	node jsclosure.js
	javac JavaClosure.java && java JavaClosure && rm JavaClosure.class