@echo off
set /P path=Enter the first main path: 
md %path%\"Pageobject"
md %path%\"PageResources"

set /P path=Enter the project path: 
md %path%\"YourLogos"
md %path%\"YourReport"


