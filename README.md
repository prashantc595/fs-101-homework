# The fs101 v2 course

This is the main repository for fs101 v2 course. 

Following is the structure of this repository:

* `content`: This directory will have links to the slides and any other course content
* `homework`: This directory will contain daily homework questions
* `reading-resources`: This directory will contain daily reading resources

## Youtube playlist

The videos for the course are on Youtube - [Link](https://www.youtube.com/playlist?list=PL9K3Drwh2MNDRTtWqHgcxbjsRMk5fEDv2)

## Creating homework repository

Clone the repository

```
git clone git@github.com:rahul0208/fs-101-homework.git
```

Create a new private repository under your username. For example, `https://github.com/:rahul0208/fs-101-homework`

Remove the `origin` remote

```
git remote rm origin
```

Add origin remote pointing to your repository

```
git remote add origin <YOUR_GIT_REPO_SSH_URL>
```

Push the changes to your repository

```
git push -u origin master
```

Add `rahul0208` as collaborator `https://github.com/:username/fs-101-homework/settings/collaboration`

