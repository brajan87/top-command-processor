# Top National and State Commands

This project is to get the top commands state and nation wise.

### Dependencies

Listed below are dependencies used in this project.
* Spring Boot 2.5
* Java 11
* Gradle 7.1
* Lombok 1.18.20
* Junit 4 (Note : Please verify in the Run Configuration that the IDE is using Junit4 for running the test cases)
* Mockito 3.7.7

### Assumptions
 * There will always be atleast one stateCommand in the input request.
 * There will not be any set of state commands without state name.
 * When there is a speaker, then speaker command will be in the input request. 

If any of the above conditions are not met, then it is considered as a bad request.

 * There will be always one list of commands for a given state in the input request.
 * Letter case of the commands in the response will be decided based on the first occurance of the command in the input request.


### Sample Request

{
    "stateCommands": [
        {
            "state": "alabama",
            "commands": [
                {
                    "speaker": "Fred Zhang",
                    "speakerCommand": "CNN"
                },
                {
                    "speaker": "Fred Zhang",
                    "speakerCommand": "NBC"
                },
                {
                    "speaker": "Fred Zhang",
                    "speakerCommand": "CNN"
                }
            ]
        },
        {
            "state": "Florida",
            "commands": [
                {
                    "speaker": "Thomas Brown",
                    "speakerCommand": "Show me movies"
                },
                {
                    "speaker": "Alisha Brown",
                    "speakerCommand": "Stranger Things"
                },
                {
                    "speaker": "Marcus Brown",
                    "speakerCommand": "Game of Thrones"
                },
                {
                    "speaker": "Missy Brown",
                    "speakerCommand": "Turn off the TV"
                },
                {
                    "speaker": "Missy Brown",
                    "speakerCommand": "Turn off the TV"
                }
            ]
        },
        {
            "state": "maryland",
            "commands": [
                {
                    "speaker": "Thomas Black",
                    "speakerCommand": "Show me comedies"
                },
                {
                    "speaker": "Alisa Black",
                    "speakerCommand": "Game of thrones"
                },
                {
                    "speaker": "Marcus Black",
                    "speakerCommand": "game of thrones"
                },
                {
                    "speaker": "Missy Black",
                    "speakerCommand": "game OF thrones"
                },
                {
                    "speaker": "Missy Black",
                    "speakerCommand": "turn off the TV"
                }
            ]
        }
    ]
}

### Sample Response

{
    "stateCommands": [
        {
            "state": "alabama",
            "frequentCommand": {
                "mostFrequentCommand": "CNN",
                "startProcessTime": "1630032641623",
                "stopProcessTime": "1630032641623"
            }
        },
        {
            "state": "Florida",
            "frequentCommand": {
                "mostFrequentCommand": "Turn off the TV",
                "startProcessTime": "1630032641623",
                "stopProcessTime": "1630032641623"
            }
        },
        {
            "state": "maryland",
            "frequentCommand": {
                "mostFrequentCommand": "Game of thrones",
                "startProcessTime": "1630032641623",
                "stopProcessTime": "1630032641623"
            }
        }
    ],
    "topCommandNationally": [
        "Game of Thrones",
        "Turn off the TV",
        "CNN"
    ]
}
