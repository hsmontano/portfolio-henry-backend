# Requirements

## User Stories

### Authentication (OAuth 2.1)

-   As a user, I want to authenticate securely using OAuth 2.1 so that I
    can access my personal dashboard and protected features.
-   As a returning user, I want to log in using my preferred identity
    provider so that I don't need to create a new account.

### Estimation System

-   As a potential customer, I want to request a project estimation so
    that I can understand the cost and effort before hiring the service.
-   As a user, I want to upload or enter project details into the
    estimation system so that I can receive an accurate quote.

### Scheduling System

-   As a customer, I want to schedule an appointment or meeting so that
    I can discuss project requirements with the engineer.
-   As a user, I want to view my upcoming scheduled meetings so that I
    can manage my time effectively.

### Payment System

-   As a customer, I want to make secure payments online so that I can
    purchase services or courses without complications.
-   As a user, I want to see my payment history so that I can track
    invoices and transactions.

### Courses Section

-   As a learner, I want to browse available courses so that I can
    choose which one to enroll in.
-   As a learner, I want to enroll in a course so that I can access
    educational content relevant to my needs.
-   As a user, I want to track my progress in courses so that I know
    what modules I have completed.

### Project Registration

-   As an admin, I want to register projects with an id, title, link,
    description, and image so that I can showcase my professional
    portfolio.
-   As a visitor, I want to browse the project portfolio so that I can
    evaluate the engineer's previous work.

### Notifications

-   As a user, I want to receive notifications so that I stay informed
    about important updates.
-   As an admin, I want to send notifications automatically based on
    system events so that users stay informed.

### User General Information Module

-   As a user, I want to manage my personal information so that my
    profile and preferences stay up to date.
-   As an admin, I want to view user information so that I can provide
    support.

------------------------------------------------------------------------

## Acceptance Criteria (Gherkin)

### Authentication

    Given the user is on the login page
    When the user selects an OAuth provider and authenticates successfully
    Then the user should be granted access to their dashboard

    Given a returning user is authenticated by the OAuth provider
    When they access the application
    Then the system should recognize them and allow access without re-registration

### Estimation System

    Given a user is on the estimation request page
    When the user submits required project details
    Then the system should create an estimation request

    Given an estimation request exists
    When the system processes the request
    Then an estimation result should be generated and made available to the user

### Scheduling System

    Given a user is on the scheduling page
    When the user selects an available time slot and confirms
    Then the system should create a scheduled appointment

    Given a user has scheduled appointments
    When they open their schedule page
    Then the system should show a list of upcoming appointments

### Payment System

    Given a user is on the payment page
    When the user submits a valid payment method and confirms payment
    Then the system should process the payment successfully

    Given the user has previous transactions
    When they open the payment history page
    Then the system should display the list of payments made

### Courses Section

    Given courses exist in the system
    When a user opens the courses page
    Then the system should display the list of available courses

    Given a user is viewing a course detail page
    When the user selects the enroll option
    Then the system should register the enrollment

    Given a user is enrolled in a course
    When the user accesses the course dashboard
    Then the system should display their progress

### Project Registration

    Given an admin is on the project creation page
    When the admin submits project id, title, link, description, and image
    Then the system should create the project record

    Given projects exist in the system
    When a visitor opens the portfolio page
    Then the system should display the list of projects

### Notifications

    Given a user has notifications available
    When they access their notification panel
    Then the system should display the notifications

    Given a system event occurs that requires user notification
    When the event is processed
    Then the system should create a notification for the relevant user

### User General Information Module

    Given a user is on the profile page
    When the user updates their personal information and saves
    Then the system should store the updated information

    Given the user has saved personal information
    When they open the profile page
    Then the system should display the stored information
