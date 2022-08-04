@smoke
Feature: Sing in functionality

  Background: user is on main page
         Given user is on main page

  Scenario Outline:login with invalid credentials
         When user clicks Sign-in button
         And  user enters "<email>" to email text area
         And  user enters "<password>" to password text area
         And  user clicks login button
         Then user should see danger message

         Examples:
          |      email          |     password      |
          |mike@mobiquity.com   | mike.mobiquity375 |
          |john@mobiquity.com   | john.mobiquity789 |
          |cris@mobiquity.com   | cris.mobiquity930 |
          |nari@mobiquity.com   | nari.mobiquity134 |
          |Ioan@mobiquity.com   | Ioan.mobiquity418 |

