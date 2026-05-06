# Git Notes — Short Version

## What is Git?

Git is a tool that tracks changes in your project.

It helps you:

- Save versions of your work
- See what changed
- Go back if something breaks
- Work with others
- Upload code to GitHub

## Git vs GitHub

| Git | GitHub |
|---|---|
| Tracks changes on your computer | Stores your project online |
| Used in the terminal | Used in the browser or with Git |

## Repository

A **repository**, or **repo**, is a project folder that Git is tracking.

To turn a folder into a Git repo:

```bash
git init
```

## First-Time Setup

Set your name:

```bash
git config --global user.name "Your Name"
```

Set your email:

```bash
git config --global user.email "your-email@example.com"
```

Check your settings:

```bash
git config --global --list
```

## Basic Git Workflow

The main Git cycle is:

```bash
git status
git add .
git commit -m "Describe what you changed"
```

### What each command does

```bash
git status
```

Shows which files changed.

```bash
git add .
```

Stages all changed files.

```bash
git commit -m "message"
```

Saves a checkpoint of your project.

## Git Stages

Git has three main stages:

```text
working folder -> staging area -> commit
```

| Stage | Meaning |
|---|---|
| Working folder | Where you edit files |
| Staging area | Files prepared for commit |
| Commit | Saved version/checkpoint |

## Good Commit Messages

Good examples:

```text
Add login page
Fix navbar layout
Update README
Create homepage
```

Bad examples:

```text
stuff
changes
final
asdf
```

## See Project History

Show full history:

```bash
git log
```

Show shorter history:

```bash
git log --oneline
```

## See File Changes

Before staging:

```bash
git diff
```

After staging:

```bash
git diff --staged
```

## Connect to GitHub

After creating a repository on GitHub, connect your local project:

```bash
git remote add origin https://github.com/username/project-name.git
```

Rename your branch to `main`:

```bash
git branch -M main
```

Push your code the first time:

```bash
git push -u origin main
```

After that, you can usually use:

```bash
git push
```

## Push and Pull

```bash
git push
```

Uploads your commits to GitHub.

```bash
git pull
```

Downloads the newest changes from GitHub.

## Clone a Repository

To download an existing GitHub project:

```bash
git clone https://github.com/username/project-name.git
```

Then enter the folder:

```bash
cd project-name
```

## Branches

A **branch** is a separate version of your project.

Create and switch to a new branch:

```bash
git switch -c branch-name
```

Switch branches:

```bash
git switch main
```

See all branches:

```bash
git branch
```

Merge a branch into `main`:

```bash
git switch main
git merge branch-name
```

## `.gitignore`

A `.gitignore` file tells Git what not to track.

Common examples:

```text
node_modules/
.env
venv/
__pycache__/
```

You usually ignore files that are:

- Huge
- Secret
- Temporary
- Automatically generated

## Useful Git Commands

| Command | Meaning |
|---|---|
| `git init` | Start tracking a project |
| `git status` | See changed files |
| `git add .` | Stage all changes |
| `git commit -m "message"` | Save a checkpoint |
| `git log --oneline` | View commit history |
| `git remote -v` | View connected GitHub repo |
| `git push` | Upload commits |
| `git pull` | Download updates |
| `git clone URL` | Download a repo |
| `git branch` | Show branches |
| `git switch branchName` | Switch branches |
| `git switch -c branchName` | Create and switch branch |

## Beginner Workflow to Memorize

```bash
git status
git add .
git commit -m "Describe what you changed"
git push
```

## Main Idea

Git tracks your project history.

GitHub stores your Git project online.