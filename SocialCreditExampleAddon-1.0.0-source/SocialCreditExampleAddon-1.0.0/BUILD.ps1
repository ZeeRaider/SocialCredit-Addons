$ErrorActionPreference = "Stop"

$ProjectRoot = Split-Path -Parent $MyInvocation.MyCommand.Path
Set-Location $ProjectRoot

Write-Host ""
Write-Host "=============================================" -ForegroundColor Cyan
Write-Host " Building SocialCreditExampleAddon 1.0.0" -ForegroundColor Cyan
Write-Host "=============================================" -ForegroundColor Cyan
Write-Host ""

$CoreJar = Join-Path $ProjectRoot "libs\SocialCredit-1.6.4.jar"
if (-not (Test-Path $CoreJar)) {
    throw "Missing required dependency jar: $CoreJar"
}

mvn clean package

Write-Host ""
Write-Host "Build complete." -ForegroundColor Green
Write-Host "Output: target\SocialCreditExampleAddon-1.0.0.jar" -ForegroundColor Green
Write-Host ""
