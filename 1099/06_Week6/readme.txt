Logging system

2. In order to manage the app logs define a module that will save all logs in a single/unique file
- there will be unique log files for errors and general info
- the files will be created and opened when the app starts (eager instantiation)
- the developers don't know the real file names for the 2 logs
- all loggers will implements the ILogging interface
