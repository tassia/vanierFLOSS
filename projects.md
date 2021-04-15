# FLOSS projects

Here is a curated list of FLOSS projects that we use, we develop, or we contribute with the development somehow.

When adding a new project, try to list the following info:
* Project name & description
* Repository and bug tracking system
* Developers/community communication channel (mailing list, IRC, Jitsi?)
* Why this is part of our list (eg. we use, we develop, we contribute or want-to?)
* Skills needed to start contributing

TODO: Info brought from README, please develop in the template above: "Create a repository for Java Algorithms (Starting new project)"

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

## AssNat API

This a REST API for the National Assembly of Quebec (*Assemblée Nationale du Québec* in its original French, often shortened as *AssNat*), which is the legislative body of Quebec, Canada. That's where the MPs vote laws and do a bunch of other things. The API aims to help developers and non-developers to better get information about the Assembly.

The API was developped 9 years ago by GitHub user [mna](https://github.com/mna), who did not update it since. It is now archived, meaning that the original repo is in read-only mode. That is why I [forked](https://docs.github.com/en/github/getting-started-with-github/fork-a-repo) the repository under [mehdiben7/assnatapi](https://github.com/mehdiben7/assnatapi). It is quite important to note that since the original author of the code distributed the project under the open-source [MIT License](https://github.com/mna/assnatapi/blob/master/LICENSE), contributors need to keep the same license and copyright notice.

### The project state

This API needs a lot of love. The API is not hosted in the cloud anymore and probably does not work at the moment, since the AssNat website changed a lot in the past years. The version of the technologies used in this project are also out of date. But I think this project is very interesting so I intend on making it rise from its ashes.

### Contributing

This is a cool project that needs support to make it up to date.
If any other Vanier FLOSS member want to contribute to the project, we can talk about it on the Jitsi. Bugs can also be reported in the ```issues``` section of the repo.

There's a lot of things that we can enhanced.

* Translating the documentation into English
* Updating the code to fit latest versions of the technologies used
* Updating the API to work with the current legislature
* Adding features to the API
* Hosting it into the cloud.

#### Technologies used 

* Node.JS, which is a runtime of JavaScript for off-browser, server-side usage
* Node package manager
* restify, node-static, mongodb and see-no-evil node libraries
* MongoDB database language and MongoHQ
* Nodejitsu
* JavaScript

Understanding French and the basics of the AssNat is also a plus, although a quick research on the web will give you all the information you need
