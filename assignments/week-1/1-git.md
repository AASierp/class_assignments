# Git practice
### Learning Target:
> I can use Git from the command line to track changes in files, create commits, view history, and work with branches.
---
## Part 1: Getting Started with Git
### Instructions:
1. Open **PowerShell**, **Windows Terminal**, or another command-line tool.
2. Make sure Git is installed by running:
```bash
git --version
```
If Git is installed, you should see a version number.
---
### 1. Create a new project folder and initialize Git
Navigate to a location where you want to store your work, then run:
```bash
mkdir git-practice
cd git-practice
git init
```
What does `git init` do?
What new hidden folder was created?
---
### 2. Check the status of your repository
```bash
git status
```
What information does Git give you at this point?
---
## Part 2: Tracking Files and Making Commits
---
### 3. Create a new file
Create a file named `notes.txt`:
```bash
touch notes.txt
```
Check the repository status again:
```bash
git status
```
How does Git describe this file?
---
### 4. Add content to the file
Add a line of text to `notes.txt`:
```bash
nano notes.txt
```
Now check the status:
```bash
git status
```
What changed compared to before?
---
### 5. Stage the file
```bash
git add notes.txt
```
Run `git status` again.
What section is the file listed under now?
---
### 6. Commit the file
```bash
git commit -m "Add initial notes file"
```
What does a commit represent in Git?
---
## Part 3: Viewing History and Making Changes
---
### 7. View the commit history
```bash
git log
```
What information is shown for each commit?
*(Tip: press `q` to exit the log view)*
---
### 8. Modify the file
Add another line to `notes.txt`:
```bash
nano notes.txt
```
Check the status:
```bash
git status
```
How does Git describe the file now?
---
### 9. Stage and commit the change
```bash
git add notes.txt
git commit -m "Add practice reminder"
```
Run `git log` again.
How many commits do you see now?
---
## Part 4: Working with Branches
---
### 10. View existing branches
```bash
git branch
```
What branch are you currently on?
---
### 11. Create and switch to a new branch
```bash
git checkout -b experiment
```
What does this command do?
---
### 12. Make a change on the new branch
Add another line to `notes.txt`:
```bash
nano notes.txt
```
Stage and commit the change:
```bash
git add notes.txt
git commit -m "Experiment branch update"
```
---
### 13. Switch back to the main branch
```bash
git checkout main
```
Check the contents of `notes.txt`.
Does it look different than it did on the `experiment` branch?
---
## Part 5: Cleanup (Optional)
To delete the branch you created:
```bash
git branch -d experiment
```
To remove the entire repository folder (outside the folder):
```bash
rm -rf git-practice
```
---
## Extension Questions (Bonus)
1. What does `git diff` show?
2. What is the difference between `git add .` and `git add <filename>`?
3. What happens if you try to commit without staging files first?
4. Explore `git log --oneline`. How is the output different?
5. What does `git restore <filename>` do?
6. Try creating a second file and committing it. How does Git track multiple files?
7. What is a `.gitignore` file and why is it useful?
8. Try using `git status -sb`. What extra information does it show?
## More extension activities (Collaborative)
1. With another person, explore the world of merge conflicts and how you can use cherry picking.
2. Research squashing commits and figure out when it would be helpful/unhelpful to yourself and others to use that feature.
3. Research rebasing and figure out when you might use it instead of merge. Practice using it with your practice repo.