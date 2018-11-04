Feature: Login to Nixon william page

@Smoke1
Scenario Outline: Login Test New
  Given open the NixonWilliam login URL
  When the valid "<username>" and "<password>" provided
  Then the respective account home page opened

  Examples:
    | username | password |
    | senthilteck@gmail.com | Nila1234 |

