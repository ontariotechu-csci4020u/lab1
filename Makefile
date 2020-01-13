.PHONY: compile

compile:
	mkdir -p target
	javac -d target -sourcepath ./src src/*.java

run:
	java -cp ./target Main
