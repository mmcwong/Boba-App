//
//  BALoginViewController.m
//  BobaApp
//
//  Created by Hyun Bin Kim on 2014-10-04.
//  Copyright (c) 2014 coursera interns. All rights reserved.
//

#import "BALoginViewController.h"
#import "Helpers.h"

@class BAMainTabBarController;

@implementation BALoginViewController

- (IBAction)loginButtonPressed:(id)sender {
    // Validate username/password
    // Push MainTabBarController
    
    UIStoryboard *mainStoryboard = [Helpers getMainStoryboard];
    BAMainTabBarController *mainTabBarController = [mainStoryboard instantiateViewControllerWithIdentifier:@"BAMainTabBarController"];
    
    [self presentViewController:(UIViewController *)mainTabBarController animated:YES completion:nil];
}

- (IBAction)loginWithFacebookPressed:(id)sender {
    
}

- (IBAction)loginWithGooglePressed:(id)sender {
    
}

@end
