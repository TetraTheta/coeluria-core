@echo off
set "MOD_SRC=E:\REPO-HDD\coeluria-core\build\forgix"
set "MOD_VERSION=1.1.0+1.21.7"
set "TEST_BASE=E:\GAME\PrismLauncher\instances"
echo Copying to Fabric
copy /B /D /V /Y "%MOD_SRC%\coeluriacore-%MOD_VERSION%.jar" "%TEST_BASE%\Fabric 1.21.7\minecraft\mods\"
echo Copying to NeoForge
copy /B /D /V /Y "%MOD_SRC%\coeluriacore-%MOD_VERSION%.jar" "%TEST_BASE%\NeoForge 1.21.7\minecraft\mods\"
pause
