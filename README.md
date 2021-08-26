# Top National and State Commands

This project is to get the top commands state wise and nation wise.

### Dependencies

Listed below are dependencies used in this project.
* Spring Boot 2.5
* Java 11
* Gradle 7.1
* Lombok 1.18.20
* Junit 4
* Mockito 3.7.7


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
                "startProcessTime": "1629981906364",
                "stopProcessTime": "1629981906364"
            }
        },
        {
            "state": "Florida",
            "frequentCommand": {
                "mostFrequentCommand": "Turn off the TV",
                "startProcessTime": "1629981906364",
                "stopProcessTime": "1629981906364"
            }
        },
        {
            "state": "maryland",
            "frequentCommand": {
                "mostFrequentCommand": "Game of thrones",
                "startProcessTime": "1629981906364",
                "stopProcessTime": "1629981906364"
            }
        }
    ],
    "nationCommands": [
        "Game of Thrones",
        "Turn off the TV",
        "CNN"
    ]
}
