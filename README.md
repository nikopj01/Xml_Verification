# Project Name

XML File Verificaton

## Description

The primary objective of this project is to ascertain the validity of a provided string as an XML string.
The essence of the code algorithm can be summarized as follows:
When processing XML data, each opening tag encountered is added to a stack, 
while closing tags are used to compare with the top item of the stack. 
If a match is found, the top item is removed from the stack. 
In the case of a valid XML string, the stack should ultimately be empty, indicating that all tags have been properly matched and closed.

## Table of Contents

- [Project Name](#project-name)
  - [Description](#description)
  - [Test Case](#test-case)
  - [Screenshot ](#screenshot)

## Test Case

Below is a list of XML strings that were utilized for verifying the functionality of the code:
```
- <html><tag></tag></html> = valid
- <Design><Code>hello world</Code></Design> = valid
- <Design><Code></Code><Code></Code></Design> = valid
- <Design><Code>hello world</Code></Design><People> = invalid
- <People><Design><Code>hello world</People></Code></Design> = invalid
- <People age=”1”>hello world</People> = invalid
```

## Screenshot 
![image](https://github.com/nikopj01/Xml_Verification/assets/49547666/3f5f8b94-951e-418b-8209-d9e833d2b671)

