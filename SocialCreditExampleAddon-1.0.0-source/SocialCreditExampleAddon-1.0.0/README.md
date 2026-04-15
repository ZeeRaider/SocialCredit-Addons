# SocialCreditExampleAddon

Official reference addon for the SocialCredit framework.

This addon exists to demonstrate the intended extension model for SocialCredit:
- depend on the public API
- listen to public events
- avoid internal classes
- modify behaviour safely through addon logic

## What this addon does

This example listens to `SocialCreditPreChangeEvent` and demonstrates three safe extension patterns:

- caps very large negative penalties at **-10**
- rewrites the reason text when the penalty is capped
- blocks a specific forbidden reason entirely

It is intentionally small and exists as a clean reference implementation.

## Target

- SocialCredit core: **1.6.4**
- Java: **21**
- Paper: **1.20.4**

## Build notes

This project expects the SocialCredit core jar to be present at:

```text
libs/SocialCredit-1.6.4.jar
```

Then build with:

```powershell
mvn clean package
```

Expected output:

```text
target/SocialCreditExampleAddon-1.0.0.jar
```

## Why this exists

SocialCredit core is designed to remain stable and framework-first.

New mechanics should be introduced through addons rather than by forcing everything into core.  
This repository is the smallest useful example of that approach.
