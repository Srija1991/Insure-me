# Insure me-project

	This project will help you to understand various concept related to Insurace domain. Please read the Insurace-domain.pdf to get more functional knowledge on Insurace domain. 
This project front is based on simple HTML, CSS and Angular Js ad Backend is Java Spring Boot.

	The source of java application for INSUREME is provided by staragile team.


	
	This is a CI/CD pipeline using Git as a source code management tool, maven as build tool,docker as containersing tool,ansible as configuration management tool and selenium as testing tool.


	The pipeline script is used to create CI/CD pipeline.


	This repo has files needed for CI/CD pipeline (Jenkins_file, ansible-playbook.yml,Docker file).


	The code is build using maven tool.


	The packaged jar file is used to create an docker image and pushed onto dokerhub with tag srija1991/insureme.


	Then docker image is used to create a container and is deployed onto deploy server using ansible-playbook.yml.



	Then the runnablejar exported from ecllipse is used to confirm the accuracy of Insure-me application on web.





In order to run the application use port 8085

