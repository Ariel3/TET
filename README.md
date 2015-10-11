# TET

##Description##

We created a keyboard which is activated by movement of the eyes only, and is a great solution for handicapped people, who can only move their eyes. 
We used the Eye Tribe tracker device which tracks the movement of the eyes, in order to create the keyboard. Although, we can absolutely use any other eye tracker for this, with very few modifications to the source code.

##Project input:##
*NO INPUT NECESSARY!

##Project output:##
*The user will focus on a key on the keyboard for a short amount of time, and the content of the key will be added to the text field on the top of the window.


##Installation##

Firstly, you will need to install the following SDK: TheEyeTribeSDK-0.9.56-x86.exe, in order to communicate with The Eye Tribe.
Secondly, you will have to options:
1) Download all the rest of the source files (including gson-2.3.1.jar), and import them to Netbeans project, and run Test1.java.

2) Download TET.jar file, and open it. 


##Algorithm##

The algorithm is GUI and mouse movement based. A fixation is when both eyes fixate on a certain spot on the screen for a milisecond. The Eye Tribe is granted control of the mouse cursor. As soon as the cursor enters the boundaries of a button, it waits 0.8 seconds. After that time passes, the program checks the current position of the cursor: If still within the boundaries of the same button, we will say that there was a fixation and the button will click. Otherwise, we will continue until the next fixation. If a button is clicked, it will add the corresponding character to the text field (e.g.: If i click 'a', the letter 'a' will be added).

##Known Issues##

We did not create our own calibration, because we wanted high precision calibration, so we relied on The Eye Tribe calibration.

If you discover any bugs, feel free to create an issue on GitHub fork and send us a pull request.

##Authors##
- Roi Benita (https://github.com/roibenita)
- Daniel Blank (https://github.com/danielblank1)
- Ariel Hazan (https://github.com/Ariel3)
- Netanel Ben-Haim

##Credit##

This project is part of an exercise in Software Structure course in Ariel University with Dr. Boaz Ben-Moshe.

##Contributing##

1. Fork it
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -am 'Add some feature')
4. Push to the branch (git push origin my-new-feature)
5. Create new Pull Request

##License##

None.
