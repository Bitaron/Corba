:: SET myvar = "filename.idl"

:: SETLOCAL ENABLEEXTENSIONS

SET me=%~n0
SET parent=%~dp0
:: SET dirname=container
:: SET /A myvar = 2+2
SET FILEPATH=%parent%

:: FOR %%a IN (%FILEPATH%\*) DO @ECHO %%a
echo "here"
 :: FOR %%a IN (%parent%%1\*) DO ( cd %1  & echo %%~na & cd ..)
 FOR %%a IN (%parent%%1\*) DO ( cd %1 & idlj -fall -td %parent%%2 -i OMGidl/ %%a & cd ..)
:: cd ..

