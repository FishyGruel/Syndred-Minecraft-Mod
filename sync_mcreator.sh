#!/bin/bash
# cd /home/nekoniyah/MCreatorWorkspaces/syndred/

BRANCH="master"

git fetch origin master
git add -A
git commit -m "Auto-sync: $(date +'%Y-%m-%d %H:%M:%S')"

git merge
git rebase

git add -A
git commit -m "Auto-sync: $(date +'%Y-%m-%d %H:%M:%S')"

git push origin master
