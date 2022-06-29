Feature: Login feature with parameters
  Scenario Outline: Login with multiple credentials
		Given User is on Home Page
		When User Navigate to LogIn Page
		And User enters UserName <UserName> and Password <Password>
		Then Message displayed Login <Status>
		
    Examples: 
      | UserName  			| Password 						| Status  |
      | Ravi kishan 		| ravikishan@amul.com | success |
      | Kesarilal Yadav	| kesarilal@yadav.com | Fail    |

			# Scenario Outline is used when scenario is data-driven and taeks data from 'Example' data-table
      # UserName, Password and Status are keys for accessing the values from data-table,
      # and passed through <> tags in Scenario
      # empty braces '{}' is used in step definition steps in place of <> tags, whare data is passed 