# FLOSS projects

Here is a curated list of FLOSS projects that we use, we develop, or we contribute with the development somehow.

When adding a new project, try to list the following info:
* Project name & description
* Repository and bug tracking system
* Developers/community communication channel (mailing list, IRC, Jitsi?)
* Why this is part of our list (eg. we use, we develop, we contribute or want-to?)
* Skills needed to start contributing

## Omnivox Scraper
This software is a creation of Vanier College's Computer Science and Mathematics student [solonovamax](https://github.com/solonovamax) and is shared under the [MIT license](https://github.com/solonovamax/Omnivox-Scraper/blob/master/LICENSE.md).

The majority of CEGEPs/Colleges in the province of Quebec uses Omnivox. The goal of this software is to *scrape* subdomains of ```vaniercollege.omnivox.ca``` i.e. retrieving data for further use in other softwares

The project is hosted on GitHub in the [solonovamax/OmnivoxScraper](https://github.com/solonovamax/Omnivox-Scraper) repository

There is no official communication channel at the moment, but GitHub issues can be used to report bugs for this project. Omnivox Scraper is an interesting project because it aims to enhance a tool that we (students enrolled in the Vanier College FLOSS club) use on a daily basis.

Contributing to this project is within almost everybody's reach. Here's the skills you'll need:
* Basic to intermediate Java OOP programming
* Basic XML skills
* Basic understanding of how Gradle projects work
* Access to Omnivox

## Usability tests in Debian Bullseye

#### The Debian project

Debian is the FLOSS project behind the GNU/Linux distribution Debian. It is totally run by volunteers, more than 1000 official developers, that work together to build a Free operating system. If you want to learn more about it, the [intro page in Debian's website](https://www.debian.org/intro/about) is a good start.

#### Contributing

There are many ways to contribute to such a large project: building packages, maintaining the website, translation of packages/documentation/website, writing documentation, quality assurance, bug fixing and triaging, advocacy, organizing local events, and [many other ways](https://www.debian.org/intro/help).

#### Usability testing

The last time we heard about usability tests in Debian was in [2017](https://people.debian.org/~intrigeri/blog/posts/GNOME_and_Debian_usability_testing_201705/). We are about to get a new stable realease (codename Bullseye), a good moment to start planning a new set os tests.

A few links for further reading - food for thoughts!
 - [State Of Linux Usability 2020 - Law Zava](https://lawzava.com/blog/state-of-linux-usability-2020/)
 - [Usability testing: how do we design effective tasks](https://ubuntu.com/blog/usability-testing-how-do-we-design-effective-tasks)
 - [Usability Testing & Evaluation of Chores in GNU/Linux for Novice - Muhammad Hamid Fayyaz & Usman Idrees](http://www.diva-portal.org/smash/get/diva2:832464/FULLTEXT01.pdf)
 - [Usability Testing Contribution Guide - Clarissa Lima](https://github.com/clarissalimab/ux)
 - [Usability article on Debian Wiki](https://wiki.debian.org/Usability)

## JobFinderBot

A project started by a Vanier graduate of the CST program. The COVID-19 pandemic
hit the whole word hard. Many people lost their jobs. At the same time, social
communication platforms like Discord exploded in popularity. With these 2 facts
in mind, Slav decided to create a Discord bot which uses the [Adzuna
API](https://developer.adzuna.com/ ) (and potentially other free job search APIs
in the future) and [DiscordPy](https://discordpy.readthedocs.io/en/stable/) to
help people find jobs. Currently the bot is deployed/hosted on a free-tier
Compute Engine VM running in the cloud. The project currently does not generate
any costs to maintain, but as its user base grows, and more people add the bot
to their Discord servers, the project will require higher tiers of compute to
sustain itself. Collaborators on this project may be called upon to provide
ideas on garnering community funding for the continued support of the project.

* Repository Link: https://github.com/vyacheslav31/JobFinderBot
* Bug Tracking System: GitHub Issue tracker.
* Developer's community channel: [Join Discord](https://discord.gg/QZWWaJBRgx) Development Server 

#### Requirements
1. Knowledge of Python
2. Able to learn how to use Discord.Py
3. Understanding of how API calls work 
4. Understand how to implement & use an in-memory DB with [SQLite3](https://www.sqlite.org/index.html).
5. Good code readability and documentation skills

#### Example Output
![Screenshot from 2021-09-16 01-43-54](https://user-images.githubusercontent.com/43866398/133556342-ee74fb97-a9f4-4254-891f-c1dfe1e67cf9.png)
 
