# Super Pet App

## Overview

This is home to the Super Pet App. It's an app that allows you to manage your pets health, keep track of their appointments, and more!  

## Getting Started

### Prerequisites

Before you begin, make sure you have the following requirements met:

1. **Node.js version 18.16.0** installed on your system.  
   You can check your **Node.js** version by running the following command in your terminal:  

    ```bash
    node -v
    ```  

    If you have a different version of **Node.js** installed, please install the required version here before proceeding.

2. Visual Studio Code (VS Code) installed on your system.  
   If you don't have it installed, you can download it from the official website [here][vscode-install-url].

3. MongoDB connection URL: To connect to our cloud MongoDB database, you need to add the following URL:  

    ```
    mongodb+srv://test_admin:<ADMINPET@superpetapp.2240fzp.mongodb.net>/?authMechanism=DEFAULT
    ```

### Running the App  

To run the app, please follow these steps:

1. Open VS Code and navigate to the project directory.  
2. Open a terminal in VS Code by selecting View -> Terminal from the menu bar.
3. In the terminal, run the following command to install the project dependencies:

    ```bash
    npm install
    ```

    This command will download and install all the required dependencies specified in the project's package.json file.

4. After the installation of dependencies is complete, you can start the program by running the following command in the terminal:

    ```bash
    npm start
    ```

    This command will execute the program, and you should see the output in the terminal or as specified by the project.

Congratulations! :tada:  
You have successfully set up and executed the program.

### Troubleshooting

If you encounter any issues during the installation or execution process, please try the following troubleshooting steps:

1. Double-check that you have the correct version of **Node.js** installed (v18.16.0).

2. Ensure that you are in the project directory when running the commands.

3. Verify that the MongoDB connection URL is correctly set up in your project configuration files.  
   If you're experiencing connection issues, ensure that you have provided the correct credentials and network access.  

    !!! reminder
        The connection URL is: `mongodb+srv://test_admin:<ADMINPET@superpetapp.2240fzp.mongodb.net>/?authMechanism=DEFAULT`

    If the issue persists, please contact our support team for further assistance.

[vscode-install-url]: https://code.visualstudio.com/download
