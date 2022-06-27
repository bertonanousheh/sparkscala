# sparkscala
ScalaCodingChallanges
 we would like you to write a program in Scala that downloads stories from the Hacker News API: https://github.com/HackerNews/API

For each of the top 30 stories, we want to have an output containing:

The story title
The top 10 commenters of that story.
For each commenter:

The number of comments they made on the story.
The total number of comments they made among all the top 30 stories.
For instance, if we consider just the 3 top stories (instead of 30) and top 2 commenters (instead of 10):

| Story A | Story B | Story C |

|--------------------|---------------------|---------------------|

| user-a (1 comment) | user-a (4 comments) | user-a (4 comments) |

| user-b (2 comment) | user-b (3 comments) | user-b (5 comments) |

| user-c (3 comment) | user-c (2 comments) | user-c (3 comments) |

We want the output to look as follows:

| Story   | 1st Top Commenter               | 2nd Top Commenter |

|---------|---------------------------------|---------------------------------|

| Story A | user-c (3 for story - 8 total)  | user-b (2 for story - 10 total) |



We need the program to parallelize the requests and aggregate the results as efficiently as possible. This is one of the main aspects that our recruiting team will pay attention to when assessing your solution.

When you're done, we'd like you to put your code on GitHub and share the link with us along with a short documentation to help our team run your code.

We recommend you to take a little extra time to create a reasonably polished solution. High quality, well commented code and basic unit testing will go a long way too.
