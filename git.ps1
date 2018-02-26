param
(
    [string]$log
)
.\clear.ps1
git add -A
git commit -m $log
git push

