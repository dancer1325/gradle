* `gradle [taskName1 taskName2 ..] [--optionNames...]` / `gradle [--optionNames...] [taskName...]`
  * `[--optionNames...]`
    * allowed passing before OR after
    * if it enables something → negation is `[--no-optionNames...]`
    * some are added by plugins
* `gradle :taskName`  
  * executes the task `taskName` on the root project -- Check 'gradle-tutorials' repo --
