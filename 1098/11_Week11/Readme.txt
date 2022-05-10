1. To efficiently manage (from a memory point of view) scenarios in which players interact with multiple computer-controlled characters find a solution based on:
- the collection of computer-coordinated characters contains elements of the same kind (the same 3D models)
- the space occupied by a 3D model is significant
- generating such a scenario requires a significant memory space for the client
- 3D models are displayed on the screen at different coordinates and can have textures of different colors
- an efficient solution must be found regarding the management of these situations


2. During the game the client may lose the connection to the server (for various reasons). When this happens,the different modules in the game must react accordingly
- the game instance must be saved on the client
- character attributes must be saved
- the gamer must be notified
- the connection must be retried


3. Depending on the involvement in the game (time spent, activity during the game, etc.) players receive bonus points.
This strategy is established by the marketing department and changes depending on other campaigns, time of year, etc.
Find a solution that allows:
- modifying the strategy for granting the runtime bonus without modifying the implementation of the game. It is considered that currently there are 3 strategies / ways to grant the bonus.

4. Game characters actions are affected by their state
- the gameplay is different
- the action effects are different
- the way the superhero moves is affected by its state (lifepoints)

