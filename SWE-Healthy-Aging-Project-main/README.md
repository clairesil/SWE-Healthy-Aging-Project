# SWE-Healthy-Aging-Project
For COMP3381 - Software Engineering Project-Based Course

This demonstrates the code that my software development team created for our client in order to categorize and illustrate the most important activities within a dataset.

This is run on the command line: 

User Manual: Whole Person Health Aging Data Analysis Project
Created by Annika Sonne, Khadija Mohamed, Rula Al-Saloom, Sneha Patil & Claire Silverstein

Table of Contents
Introduction
System Requirements
Installation and Setup
Project Overview
Using the Project
Data Import
Clustering
Viewing Results
Troubleshooting
Conclusion

1. Introduction

The Whole Person Health Aging Data Analysis project is designed to analyze and cluster data related to healthy aging. This user manual provides instructions on how to use the project effectively, including installation, setup, and a step-by-step guide on performing data import, clustering, and viewing results.

2. System Requirements

Before using the project, ensure that your system meets the following requirements:

Java Runtime Environment (JRE 17) 
Access to the project repository: https://github.com/dussec/whole-person-health-aging-data-analysis.git

3. Installation and Setup
To install and set up the project, follow these steps:
Confirm the zip file you downloaded has a folder named “HealthyAgingProject”, make sure there are two sub-folders “bin” and “src”. Once you confirm these two sub-folders are present, you may skip step 2. 
Clone the project repository from the link above. 
Note: if you need to edit the code then you will need to complete this step!
Ensure you have downloaded the necessary data file(s) for analysis from above. 
Open a terminal or command prompt and navigate to the project folder on your local machine.
Compile the Java source files by executing the appropriate commands. Use the following commands in the terminal:
For Mac and Windows: javac -cp . Person.java TScore.java Clusterer.java Clustering.java 
Mac: javac -cp "/path/to/lib/*" DataImport.java 
Windows: javac -cp "C:\path\to\lib\*" DataImport.java
Replace "/path/to/lib/*" with the actual file path of the "lib" folder in the project. Note: it must end in /lib/*
Once the code is compiled successfully, you are ready to run the project

4. Project Overview
Provide an overview of the project's purpose, functionality, and key features. Explain the main objectives of the project and how it can assist users in analyzing and clustering data related to healthy aging.

5. Using the Project
This section provides step-by-step instructions on how to use the project effectively.
5.1 Data Import
Open a terminal or command prompt and navigate to the project's "bin" directory.
Execute the following command:

Mac: java -cp "/path/to/lib/*:/path/to/bin" testing_commit.DataImport "file/path/of/your/excel/file"
Windows: java -cp "C:\path\to\lib\*;C:\path\to\bin" testing_commit.DataImport "file\path\of\your\excel\file"

Replace "/path/to/lib/*" with the file path of the "lib" folder (note: with /lib/* included), and "file/path/of/your/excel/file" with the actual file path of the Excel sheet you want to run the algorithm on.

Wait for the import process to complete. If successful, the terminal will display the clustering output and the message: "Results written to text file successfully!" 

To view the results, locate the "output.txt" file in your computer's file system. The file contains the output of the code, including the number of activities listed for each cluster. Note: this should be on your desktop.

5.2 Clustering
Open a terminal or command prompt and navigate to the project's "bin" directory.
Execute the following command:

Mac: java -cp "path/to/lib/*:/path/to/bin" testing_commit.Clustering arg
Windows: java -cp "C:\path\to\lib\*;C:\path\to\bin" testing_commit.Clustering arg



Replace "path/to/lib/*" with the file path of the "lib" folder, and "arg" with an integer value representing the amount of top activities to be printed for each cluster.
Wait for the clustering process to complete. If successful, the terminal will display the message: "Results written to text file successfully!"

5.3 Viewing Results
After running the clustering process, locate the "output.txt" file in your computer's file system.
Open the file using a text editor or viewer of your choice. The contents of the file will display the results of the clustering algorithm, including the activities listed for each cluster.

Review the results to gain insights into the clusters and their corresponding activities.


6. Troubleshooting
In case you encounter any issues while installing or running the project, refer to the following troubleshooting tips:

If you encounter compilation errors, ensure that you have correctly navigated to the project directory and have the necessary Java dependencies installed.
If the code fails to run, double-check the file paths provided in the command line prompts and ensure that the data file(s) and project directories are correctly specified.
If you experience any other errors or unexpected behavior, consider checking for updates or consulting the project documentation or support resources.

Common Errors:
If you get an error like the following:  
It is most likely an issue with the directory that you passed in, make sure it is formatted correctly and confirm that it is the right directory.
If you get the “dquote” error:
It is a problem with the formatting of your command line prompt, make sure the spacing matches the directions. Also make sure that you use straight quotation marks ("") instead of (“ ”).
To exit out of dquote, type a single quotation mark (") and press enter.

8. Conclusion
In conclusion, the Whole Person Health Aging Data Analysis project allows users to analyze and cluster data related to healthy aging. This user manual has provided step-by-step instructions on how to install, set up, and use the project effectively. By following the guidelines outlined in this manual, users can gain valuable insights into the clustering of activities and further their understanding of healthy aging.






Repository Cloning:
To install the project, you need to close the repository from the provided link.
https://github.com/dussec/whole-person-health-aging-data-analysis.git

Instructions on how to clone a github repository can be found here: https://docs.github.com/en/repositories/creating-and-managing-repositories/cloning-a-repository#cloning-a-repository
Note: you may skip steps 1-3 since the link has been provided for you already.
Compiling the code: 
Go to the terminal and find the directory of the project folder.
Go to whole-person-healthy-aging > HealthyAgingProject > src > testing_commit
Run the following command line prompts:
javac -cp . Person.java TScore.java Clusterer.java Clustering.java
javac -cp "/path/to/lib/*" DataImport.java/b
Replace "/path/to/lib/" with the actual file path of the "lib" folder under "whole-person-healthy-aging" > "HealthyAgingProject" on your computer. Make sure the file path ends with "/lib/".
Running the code:
Navigate to the "bin" directory in the project folder: "whole-person-healthy-aging" > "HealthyAgingProject" > "bin" > "testing_commit".
Run the following command line prompts:
java -cp "/path/to/lib/*:/path/to/bin" testing_commit.DataImport "file/path/of/your/excel/file"
Copy and paste the file path of the lib folder in the project direct and the bin folder in the format above. 
Enter the file path of the excel sheet you will be running the algorithm for as an argument for DataImport.
java -cp "path/to/lib/*:/path/to/bin" testing_commit.Clustering arg
For arg, replace it with an int value (for example: 10), this will be the argument passed into the Clustering class, the int value you pass in, represents the amount of top activities found in each cluster that will be printed.
If the code runs successfully, the terminal should output: "Results written to text file successfully!" To verify the results, navigate to your computer's file system and locate a file named "output.txt". The output of the code will be saved in this file. Check the number of activities listed for each cluster.

Common Errors:
If you get an error like the following:  
It is most likely an issue with the directory that you passed in, make sure it is formatted correctly and confirm that it is the right directory.
If you get the “dquote” error:
It is a problem with the formatting of your command line prompt, make sure the spacing matches the directions. Also make sure that you use straight quotation marks ("") instead of (“ ”).
To exit out of dquote, type a single quotation mark (") and press enter.



