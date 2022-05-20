1. Game characters actions are affected by their state
- the gameplay is different
- the action effects are different
- the way the superhero moves is affected by its state (lifepoints)


2. The game has an internal chat and players can send messages to others
- we want to filter comments / messages that are not appropriate; those messages will be droped and not sent
- messages destined for a certain player will be sent in private
- messages sent to @everyone will be broadcast messages for everyone

3. The game client must perform tasks in the background without interfering with the development of the game (without blocking or slowing it down)
- customer data backup
- receive updates for the forum
- update 3D models in silent mode (during the game)
- a solution must be found through which these tasks can be executed without affecting the execution of the game


4. Players have the opportunity to save the state of the game / character and restore it later
- the player can resume the game from a certain point